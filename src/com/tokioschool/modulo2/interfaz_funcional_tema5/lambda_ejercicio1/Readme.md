En el método main de la clase dada crea una lambda que calcule el factorial de un número entero. 
Para comprobar que funciona correctamente haz alguna llamada a dicha lambda e imprime el resultado 
por pantalla comprobando que, efectivamente, calcula el factorial.

El factorial de un entero positivo n se define como el producto de todos los números enteros 
positivos desde n hasta 1. Por ejemplo:

5! = 5 x 4 x 3 x 2 x 1 = 120
4! = 4 x 3 x 2 x 1 = 24
Utiliza el interfaz funcional predefinido Function del paquete java.util.function pero aplicándolo 
a valores enteros.

Interface Function<T,​R> {
    R apply​(T t);

}
