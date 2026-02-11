# SORTING-METHODS
Comparación de algoritmos de ordenamiento con análisis de complejidad temporal desarrollado en Java.

## Descripción
Este proyecto implementa y compara 5 algoritmos de ordenamiento:

- **Gnome Sort** - Algoritmo simple de ordenamiento por intercambio
- **Merge Sort** - Algoritmo de ordenamiento por mezcla (divide y conquista)
- **Quick Sort** - Algoritmo de ordenamiento rápido por partición
- **Radix Sort** - Algoritmo de ordenamiento por dígitos
- **Heap Sort** - Algoritmo de ordenamiento basado en heap

**Características:**
- Generador de números aleatorios (hasta 3000 números)
- Medición de tiempos con datos ordenados y desordenados
- Análisis de complejidad temporal teórica vs práctica
- Pruebas unitarias con JUnit 5
- Gestión de archivos para persistencia de datos
- Compatible con profilers (IntelliJ IDEA, VisualVM)

## Estructura del Proyecto
SORTING-METHODS/
├── README.md
├── .gitignore
└── demo/                           ← TRABAJAR SIEMPRE DESDE AQUÍ
    ├── pom.xml
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── org/sorting/
    │   │   │       ├── Main.java
    │   │   │       ├── Sorter.java
    │   │   │       ├── RandomNumbersGenerator.java
    │   │   │       └── FileManager.java
    │   │   └── resources/
    │   └── test/
    │       └── java/
    │           └── org/sorting/
    │               └── SorterTest.java
    ���── target/
        └── classes/

## Requisitos
- **Java 17** o superior
- **Maven 3.6+** (recomendado)
- **IntelliJ IDEA** (opcional, para usar profiler integrado)

## Instalación

### 1. Clonar el repositorio
git clone https://github.com/mjimevm/SORTING-METHODS
cd SORTING-METHODS

### 2. Verificar instalación de Java
java -version
Debe mostrar Java 17 o superior.

### 3. Instalación de Maven
cd demo
mvn clean install

## Compilación y Ejecución

### Opción 1: Con Maven (Recomendado)
Ve a la carpeta demo:
cd demo

Compila el proyecto:
mvn clean install

Ejecuta desde la raíz del proyecto:
cd ..
java -cp demo/target/classes org.sorting.Main

### Opción 2: Desde IntelliJ IDEA
1. **File → Open** y selecciona la carpeta `demo`
2. Espera a que Maven sincronice las dependencias
3. **Click derecho** en `Main.java` → **Run 'Main.main()'**

### Opción 3: Con Profiler en IntelliJ
1. **Click derecho** en `Main.java`
2. **Profile 'Main.main()'**
3. Ejecuta el programa normalmente
4. Al finalizar, verás los tiempos en la pestaña **"Profiler"** (abajo)

## Uso del Programa

### Ejecución Normal
== GENERADOR DE NÚMEROS ALEATORIOS ==
Ingrese la cantidad de números a generar: 1000

¿Qué tipo de datos quieres ordenar?
1. Datos aleatorios (desordenados)
2. Datos ya ordenados
Selecciona una opción (1 o 2): 1

════════════════════════════════════════
      MIDIENDO TIEMPOS DE EJECUCIÓN     
════════════════════════════════════════

Ejecutando Gnome Sort... 245.234 ms
Ejecutando Merge Sort... 3.456 ms
Ejecutando Quick Sort... 2.123 ms
Ejecutando Radix Sort... 1.234 ms
Ejecutando Heap Sort... 4.567 ms

### Archivo de Números Generados
El programa crea automáticamente un archivo `random_numbers.txt` con los números generados.

## Medición de Tiempos

### Para Datos Desordenados:
java -cp demo/target/classes org.sorting.Main
Opción: 1

### Para Datos Ordenados:
java -cp demo/target/classes org.sorting.Main
Opción: 2

### Con Profiler de IntelliJ:
1. **Click derecho** en `Main.java` → **Profile**
2. Ejecuta con opción **1** (desordenados)
3. Anota los tiempos del profiler
4. Ejecuta nuevamente con opción **2** (ordenados)
5. Compara resultados

## Algoritmos Implementados

| Algoritmo      | Complejidad Promedio | Complejidad Mejor Caso | Complejidad Peor Caso |
|----------------|---------------------|------------------------|----------------------|
| **Gnome Sort** | O(n²)              | O(n)                   | O(n²)               |
| **Merge Sort** | O(n log n)         | O(n log n)             | O(n log n)          |
| **Quick Sort** | O(n log n)         | O(n log n)             | O(n²)               |
| **Radix Sort** | O(d * (n + k))     | O(d * (n + k))         | O(d * (n + k))      |
| **Heap Sort**  | O(n log n)         | O(n log n)             | O(n log n)          |

## Pruebas JUnit

### Ejecutar todas las pruebas:
cd demo
mvn test

### Pruebas incluidas:
- **SorterTest.java** - 15 pruebas unitarias que cubren:
  - Los 5 algoritmos de ordenamiento
  - Datos desordenados
  - Datos ya ordenados
  - Datos con duplicados

### Ver cobertura de tests:
En IntelliJ: **Click derecho** en `SorterTest.java` → **Run with Coverage**

## Generación de Gráficas

### Datos para Excel:
Ejecuta el programa con diferentes tamaños (10, 50, 100, 500, 1000, 2000, 3000) y anota los tiempos.

**Ejemplo de tabla:**

| Tamaño | Gnome (ms) | Merge (ms) | Quick (ms) | Radix (ms) | Heap (ms) |
|--------|------------|------------|------------|------------|-----------|
| 10     | 0.5        | 0.1        | 0.1        | 0.1        | 0.2       |
| 100    | 5.2        | 0.8        | 0.6        | 0.3        | 1.2       |
| 1000   | 245.3      | 3.4        | 2.1        | 1.2        | 4.5       |
| 3000   | 1523.4     | 8.2        | 5.1        | 2.4        | 12.3      |

### Crear gráfica en Excel:
1. Copia los datos a Excel
2. Selecciona toda la tabla
3. **Insertar → Gráfico → Líneas**
4. Agrega título: "Comparación de Algoritmos de Ordenamiento"
5. Eje X: "Cantidad de Datos"
6. Eje Y: "Tiempo (ms)"

## Uso con Profilers

### IntelliJ IDEA Profiler (Integrado):
1. Click derecho en Main.java
2. "Profile 'Main.main()'"
3. Ejecuta el programa
4. Pestaña "Profiler" → "Method List"
5. Busca: Sorter.gnomeSort(), mergeSort(), etc.
6. Anota los tiempos

### VisualVM (Alternativa):
Terminal 1: Ejecutar el programa
java -cp demo/target/classes org.sorting.Main

Terminal 2: Abrir VisualVM
jvisualvm

1. Panel izquierdo → **Local** → **org.sorting.Main**
2. Pestaña **"Profiler"** → **"CPU"**
3. Espera a que termine el programa
4. Click **"Stop"**
5. Analiza los resultados

## Dependencias

El proyecto utiliza las siguientes librerías (gestionadas automáticamente por Maven):

- **JUnit 5.10.1** - Framework de pruebas unitarias
- **iText7 7.2.5** - Generación de documentos PDF
  - kernel - Núcleo de iText
  - layout - Diseño y formato
  - io - Entrada/salida
- **SLF4J 1.7.36** - Sistema de logging (elimina warnings)

## Solución de Problemas

### Error: "cannot find symbol" al compilar
**Solución:** Asegúrate de compilar con Maven para descargar las dependencias:
cd demo
mvn clean install

### No aparecen todos los tiempos en el Profiler
**Solución 1:** Usa más datos (5000 o 10000 en lugar de 3000)
**Solución 2:** Usa el Main con medición manual de tiempos (incluido en el proyecto)
**Solución 3:** Cambia el profiler a modo "Instrumentation" en IntelliJ

### Gnome Sort tarda demasiado con 3000 datos
**Esto es normal:** Gnome Sort es O(n²) y puede tardar varios segundos con datos grandes desordenados.

## Tecnologías Utilizadas

- **Java 17** - Lenguaje de programación
- **Maven** - Gestión de dependencias y construcción
- **JUnit 5** - Pruebas unitarias
- **Git/GitHub** - Control de versiones
- **IntelliJ IDEA** - IDE recomendado con profiler integrado
- **Excel** - Análisis de datos y gráficas

## Comparación Teórica vs Práctica

### Complejidad Esperada para 3000 Datos:

| Algoritmo      | Tiempo Esperado | Escenario      |
|----------------|----------------|----------------|
| Gnome Sort     | ~1500-2000 ms  | Desordenado    |
| Gnome Sort     | ~1-5 ms        | Ordenado       |
| Merge Sort     | ~8-15 ms       | Ambos          |
| Quick Sort     | ~5-10 ms       | Desordenado    |
| Quick Sort     | ~50-200 ms     | Ordenado (peor caso) |
| Radix Sort     | ~2-5 ms        | Ambos          |
| Heap Sort      | ~10-20 ms      | Ambos          |

## Autores

- **Jimena Vásquez** - vas25092@uvg.edu.gt
- **Alejandro Sagastume** - sag25257@uvg.edu.gt

## Curso

**CC2003 - Sección 20** - Algoritmos y Estructura de Datos  
Universidad del Valle de Guatemala  
**Hoja de Trabajo No. 3** - Ordenamientos

## Licencia

Este proyecto es parte de un trabajo académico para la Universidad del Valle de Guatemala.
