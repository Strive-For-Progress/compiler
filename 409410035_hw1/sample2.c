#include <stdio.h>

// Define an enumeration
enum  Color {
    RED,
    GREEN,
    BLUE
};

// Define a typedef for the Color enumeration
typedef enum Color Color_t;

// Declare an external variable
extern int some_variable;

// Define a function that returns the size of an integer
size_t get_int_size() {
    return sizeof(int);
}

// Define a static variable
static int static_variable = 0;

// Define a structure
struct Person {
    char name[50];
    int age;
};

int main() {
    // Create a structure variable
    struct Person person1 = {"Alice", 25};
    
    // Print the size of an integer
    printf("The size of an integer is %zu\n", get_int_size());

    // Print the name and age of the person
    printf("Name: %s Age: %d\n\n", person1.name, person1.age);

    return 0;
}
