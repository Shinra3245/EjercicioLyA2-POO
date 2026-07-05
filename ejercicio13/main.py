from archivo import Archivo
from analizador_lexico import AnalizadorLexico
import sys

class Main:

    def __init__(self):
        self.analizador = AnalizadorLexico()

    def ejecutar(self):

        if len(sys.argv) > 1:
            entrada = sys.argv[1]
        else:
            entrada = input("Escribe la ruta o el .sql: ")

        archivo = Archivo(entrada)

        if archivo.existe():
            if not archivo.es_el_tipo_correcto():
                print("El archivo debe ser .sql")
                return
            codigo = archivo.leer()
            archivo.imprimir_info()
        else:
            if entrada.endswith(".sql"):
                print("Error: El archivo especificado no existe o la ruta es incorrecta.")
                return
            
            codigo = entrada

        print("\nCODIGO ORIGINAL")
        print("-" * 40)
        print(codigo)

        self.analizador.analizar(codigo)

        self.analizador.imprimir_tokens()
        self.analizador.imprimir_errores()

if __name__ == "__main__":
    app = Main()
    app.ejecutar()