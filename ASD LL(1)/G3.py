def eliminarRecursionIzquierda(reglasGramatica):
    reglasModificadas = {}
    for noTerminal in reglasGramatica:
        Recursivas = []  
        NoRecursivas = []  
        Producciones = reglasGramatica[noTerminal]
        for produccion in Producciones:
            if produccion[0] == noTerminal:
                Recursivas.append(produccion[1:]) 
            else:
                NoRecursivas.append(produccion) 
        if len(Recursivas) != 0:
            nuevoNoTerminal = noTerminal + "'"
            while (nuevoNoTerminal in reglasGramatica.keys()) or (nuevoNoTerminal in reglasModificadas.keys()):
                nuevoNoTerminal += "'"
            for i in range(0, len(NoRecursivas)):
                NoRecursivas[i].append(nuevoNoTerminal)
            reglasGramatica[noTerminal] = NoRecursivas
            for i in range(0, len(Recursivas)):
                Recursivas[i].append(nuevoNoTerminal)
            Recursivas.append([''])
            reglasModificadas[nuevoNoTerminal] = Recursivas
    for noTerminal in reglasModificadas:
        reglasGramatica[noTerminal] = reglasModificadas[noTerminal]
    return reglasGramatica

def factorComunPorLaIzquierda(reglasGramatica):
    reglasModificadas = {}
    for noTerminal in reglasGramatica:
        Producciones = sorted(reglasGramatica[noTerminal])
        i = 0
        while i < len(Producciones):
            j = i
            while j < len(Producciones) and Producciones[j][0] == Producciones[i][0]:
                j += 1
            if j - i > 1:
                nuevoNoTerminal = noTerminal + "'"
                while nuevoNoTerminal in reglasGramatica or nuevoNoTerminal in reglasModificadas:
                    nuevoNoTerminal += "'"
                nuevaRegla = [Producciones[i][0], Producciones[i][1], nuevoNoTerminal]
                if noTerminal not in reglasModificadas:
                    reglasModificadas[noTerminal] = [nuevaRegla]
                else:
                    reglasModificadas[noTerminal].append(nuevaRegla)
                ReglasEx = [rhs[2:] if len(rhs) > 2 else [''] for rhs in Producciones[i:j]]
                if nuevoNoTerminal not in reglasModificadas:
                    reglasModificadas[nuevoNoTerminal] = ReglasEx
                else:
                    reglasModificadas[nuevoNoTerminal] += ReglasEx
            else:
                if noTerminal not in reglasModificadas:
                    reglasModificadas[noTerminal] = [Producciones[i]]
                else:
                    reglasModificadas[noTerminal].append(Producciones[i])
            i = j
    return reglasModificadas
gramatica = {
    'S': [['A', 'B', 'C'], ['S', 'uno']],
    'A': [['dos', 'B', 'C'], ['']],
    'B': [['C', 'tres'], ['']],
    'C': [['cuatro', 'B'], ['']]
}

gramaticam = gramatica.copy()

def imprimirGramatica(gramatica):
    for noTerminal, producciones in gramatica.items():
        print(f"{noTerminal} -> ", end="")
        for produccion in producciones:
            print(' '.join(produccion), end=" | ")
        print()

print('Original:')
imprimirGramatica( gramaticam)

gramatica_sin_recursion = eliminarRecursionIzquierda(gramatica)
print('Sin recursion:')
imprimirGramatica(gramatica_sin_recursion)

gramaticaConFactorComun = factorComunPorLaIzquierda(gramatica)
print('Factorización:')
imprimirGramatica(gramaticaConFactorComun)
