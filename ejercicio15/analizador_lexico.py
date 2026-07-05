from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener
from ExprLexer import ExprLexer

class ErroresLexicos(ErrorListener):

    def __init__(self):
        self.lista = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.lista.append([line, column, msg])

class AnalizadorLexico:

    def __init__(self):
        self.lexer = None
        self.tokens = None
        self.errores = ErroresLexicos()

    def analizar(self, codigo):
        entrada = InputStream(codigo)
        self.lexer = ExprLexer(entrada)
        self.lexer.removeErrorListeners()
        self.lexer.addErrorListener(self.errores)
        self.tokens = CommonTokenStream(self.lexer)
        self.tokens.fill()

    def imprimir_tokens(self):
        filas = []

        for token in self.tokens.tokens:

            if token.type == Token.EOF:
                continue

            nombre = self.lexer.symbolicNames[token.type]
            filas.append((token.text, nombre, token.type, token.line, token.column))

        ancho_lexema = max([len("LEXEMA")] + [len(fila[0]) for fila in filas])
        ancho_token = max([len("TOKEN")] + [len(fila[1]) for fila in filas])
        ancho_total = ancho_lexema + ancho_token + 6 + 6 + 8 + 4

        print("\nTOKENS")
        print("-" * ancho_total)
        print(f"{'LEXEMA':<{ancho_lexema}} {'TOKEN':<{ancho_token}} {'TIPO':<6} {'LINEA':<6} {'COLUMNA':<8}")
        print("-" * ancho_total)

        for lexema, nombre, tipo, linea, columna in filas:
            print(f"{lexema:<{ancho_lexema}} {nombre:<{ancho_token}} {tipo:<6} {linea:<6} {columna:<8}")

    def imprimir_errores(self):
        print("\nERRORES LEXICOS")
        print("-" * 40)

        if len(self.errores.lista) == 0:
            print("No hay errores lexicos")
        else:

            for error in self.errores.lista:
                print(f"Linea {error[0]}, columna {error[1]}: {error[2]}")
