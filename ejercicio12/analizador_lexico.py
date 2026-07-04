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
        print("\nTOKENS")
        print("-" * 70)
        print(f"{'LEXEMA':<15} {'TOKEN':<15} {'TIPO':<6} {'LINEA':<6} {'COLUMNA':<8}")
        print("-" * 70)


        for token in self.tokens.tokens:

            if token.type == Token.EOF:
                continue

            nombre = self.lexer.symbolicNames[token.type]
            print(f"{token.text:<15} {nombre:<15} {token.type:<6} {token.line:<6} {token.column:<8}")

    def imprimir_errores(self):
        print("\nERRORES LEXICOS")
        print("-" * 40)

        if len(self.errores.lista) == 0:
            print("No hay errores lexicos")
        else:

            for error in self.errores.lista:
                print(f"Linea {error[0]}, columna {error[1]}: {error[2]}")