def eliminarRecursionIzquierda(reglas):
    # Creamos un diccionario vacío para almacenar las reglas modificadas
    reglas_modificadas = {}
    # Iteramos sobre cada no terminal en las reglas de la gramática
    for no_terminal in reglas:
        # Listas para almacenar las producciones recursivas y no recursivas
        recursivas = []  
        no_recursivas = []  
        # Obtenemos todas las producciones para el no terminal actual
        producciones = reglas[no_terminal]
        # Iteramos sobre cada producción
        for produccion in producciones:
            # Si la producción comienza con el no terminal actual, es recursiva
            if produccion[0] == no_terminal:
                recursivas.append(produccion[1:])  # Añadimos el resto de la producción a recursivas
            else:
                no_recursivas.append(produccion) # Si no, añadimos la producción completa a no_recursivas
        # Si hay producciones recursivas
        if len(recursivas) != 0:
            # Creamos un nuevo no terminal añadiendo un apóstrofe al no terminal actual
            nuevo_no_terminal = no_terminal + "'"
            # Verificamos si el nuevo no terminal ya existe en las reglas modificadas
            while (nuevo_no_terminal in reglas.keys()) or (nuevo_no_terminal in reglas_modificadas.keys()):
                nuevo_no_terminal += "'"
            # Añadimos el nuevo no terminal a las producciones no recursivas
            for i in range(0, len(no_recursivas)):
                no_recursivas[i].append(nuevo_no_terminal)
            # Reemplazamos las reglas del no terminal actual con las producciones no recursivas
            reglas[no_terminal] = no_recursivas
            # Añadimos el nuevo no terminal a las producciones recursivas
            for i in range(0, len(recursivas)):
                recursivas[i].append(nuevo_no_terminal)
            # Añadimos una producción vacía al final de las producciones recursivas
            recursivas.append([''])
            # Añadimos las producciones recursivas al nuevo no terminal en el diccionario de reglas modificadas
            reglas_modificadas[nuevo_no_terminal] = recursivas
    # Añadimos todas las reglas modificadas al diccionario original de reglas
    for no_terminal in reglas_modificadas:
        reglas[no_terminal] = reglas_modificadas[no_terminal]
    # Devolvemos las reglas de la gramática modificadas
    return reglas

def factorComunPorLaIzquierda(reglas):
    # Creamos un diccionario vacío para almacenar las reglas modificadas
    reglas_modificadas = {}
    # Iteramos sobre cada no terminal en las reglas de la gramática
    for no_terminal in reglas:
        # Ordenamos las producciones para agrupar las que comienzan con el mismo símbolo
        producciones = sorted(reglas[no_terminal])
        i = 0
        while i < len(producciones):
            j = i
            # Buscamos producciones con el mismo símbolo inicial
            while j < len(producciones) and producciones[j][0] == producciones[i][0]:
                j += 1
            # Si hay más de una producción con el mismo símbolo, aplicamos el factor común por la izquierda
            if j - i > 1:
                # Creamos un nuevo no terminal añadiendo un apóstrofe al no terminal actual
                nuevo_no_terminal = no_terminal + "'"
                # Verificamos si el nuevo no terminal ya existe en las reglas modificadas
                while nuevo_no_terminal in reglas or nuevo_no_terminal in reglas_modificadas:
                    nuevo_no_terminal += "'"
                # Creamos una nueva regla con el nuevo no terminal
                nueva_regla = [producciones[i][0], producciones[i][1], nuevo_no_terminal]
                if no_terminal not in reglas_modificadas:
                    reglas_modificadas[no_terminal] = [nueva_regla]
                else:
                    reglas_modificadas[no_terminal].append(nueva_regla)
                # Creamos una lista para almacenar las producciones excluyendo los primeros dos símbolos
                reglas_ex = [rhs[2:] if len(rhs) > 2 else [''] for rhs in producciones[i:j]]
                if nuevo_no_terminal not in reglas_modificadas:
                    reglas_modificadas[nuevo_no_terminal] = reglas_ex
                else:
                    reglas_modificadas[nuevo_no_terminal] += reglas_ex
            else:
                # Si solo hay una producción con el mismo símbolo, la añadimos a las reglas modificadas
                if no_terminal not in reglas_modificadas:
                    reglas_modificadas[no_terminal] = [producciones[i]]
                else:
                    reglas_modificadas[no_terminal].append(producciones[i])
            i = j
    # Devolvemos las reglas de la gramática modificadas
    return reglas_modificadas

GramaticaConRecursion = {
    'S': [['A', 'a'], ['b']],
    'A': [['A', 'c'], ['S', 'd'],['']]
}

GramaticaConFactoresComunes = {
    'T': [['P','m','R'],['P','m','D']],
    'P': [['a','m','b'],['a','m','d']],
    'D': [['d']],
    'R': [['r']]
}

def imprimirGramatica(gramatica):
    for noTerminal, producciones in gramatica.items():
        print(f"{noTerminal} -> ", end="")
        for produccion in producciones:
            print(' '.join(produccion), end=" | ")
        print()

print('Caso de recursión por la izquierda ')
print('Original:')
imprimirGramatica( GramaticaConRecursion)

# Primero, eliminamos la recursión izquierda de la gramática
gramatica_sin_recursion = eliminarRecursionIzquierda(GramaticaConRecursion)

# Luego, imprimimos la gramática sin recursión izquierda
print('Sin recursion:')
imprimirGramatica(gramatica_sin_recursion)

print('Caso de factores comunes por la izquierda ')
print('Original:')
imprimirGramatica( GramaticaConFactoresComunes)

# Primero, realizamos el factor común por la izquierda en la gramática
gramaticaConFactorComun = factorComunPorLaIzquierda(GramaticaConFactoresComunes)

# Luego, imprimimos la gramática con factor común por la izquierda
print('Factorización:')
imprimirGramatica(gramaticaConFactorComun)