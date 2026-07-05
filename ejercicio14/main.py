from archivo import Archivo
from analizador_lexico import AnalizadorLexico
import sys
import select

class Main:

    def __init__(self):
        self.analizador = AnalizadorLexico()

    def hay_mas_entrada_pendiente(self):
        listos, _, _ = select.select([sys.stdin], [], [], 0)
        return bool(listos)

    def leer_lineas_restantes(self):
        lineas = []
        while self.hay_mas_entrada_pendiente():
            try:
                lineas.append(input())
            except EOFError:
                break
        return lineas

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

            lineas = [entrada] + self.leer_lineas_restantes()
            codigo = "\n".join(lineas)

        print("\nCODIGO ORIGINAL")
        print("-" * 40)
        print(codigo)

        self.analizador.analizar(codigo)

        self.analizador.imprimir_tokens()
        self.analizador.imprimir_errores()

if __name__ == "__main__":
    app = Main()
    app.ejecutar()
