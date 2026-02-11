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

```
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
    ── target/
    └── classes/
```

## Requisitos
- **Java 17** o superior
- **Maven 3.6+** (recomendado)
- **IntelliJ IDEA** (opcional, para usar profiler integrado)

## Instalación

### 1. Clonar el repositorio
```
git clone https://github.com/mjimevm/SORTING-METHODS
cd SORTING-METHODS
```
### 2. Verificar instalación de Java
java -version
Debe mostrar Java 17 o superior.

### 3. Instalación de Maven
```
cd demo
mvn clean install
```
## Compilación y Ejecución

### Opción 1
Ve a la carpeta demo:
```
cd demo
```
Compila el proyecto:
```
mvn clean install
```
Ejecuta desde la raíz del proyecto:
cd ..
```
java -cp demo/target/classes org.sorting.Main
```

### Con Profiler en IntelliJ
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


### Archivo de Números Generados
El programa crea automáticamente un archivo `random_numbers.txt` con los números generados.


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
```
cd demo
mvn test
```
### Pruebas incluidas:
- **SorterTest.java** - 15 pruebas unitarias que cubren:
  - Los 5 algoritmos de ordenamiento
  - Datos desordenados
  - Datos ya ordenados
  - Datos con duplicados

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

## Tecnologías Utilizadas

- **Java 17** - Lenguaje de programación
- **Maven** - Gestión de dependencias y construcción
- **JUnit 5** - Pruebas unitarias
- **Git/GitHub** - Control de versiones
- **IntelliJ IDEA** - IDE recomendado con profiler integrado
- **Excel** - Análisis de datos y gráficas


## Autores

- **Jimena Vásquez** - vas25092@uvg.edu.gt
- **Alejandro Sagastume** - sag25257@uvg.edu.gt

## Curso

**CC2003 - Sección 20** - Algoritmos y Estructura de Datos  
Universidad del Valle de Guatemala  
**Hoja de Trabajo No. 3** - Ordenamientos

## Licencia

Este proyecto es parte de un trabajo académico para la Universidad del Valle de Guatemala.
