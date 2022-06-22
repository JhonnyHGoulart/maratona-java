package academy.devdojo.maratonajava.javacore.interfaces.model;

/**
 * Todos os métodos de uma interface são por padrão 'public' e 'abstract';
 * Podem ser criados métodos com corpo em uma interface, utilizando 'default';
 * Podem ser declarados atributos em uma interface, por padrão todos os atributos serão constantes;
 * Podem ser criados métodos estáticos em uma interface, lembrando que métodos estáticos não podem ser sobrescritos.
 */
public interface DataRemover {
    void remove();
}
