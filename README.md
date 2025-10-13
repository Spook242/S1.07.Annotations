# S1.07. ANNOTATIONS

# TECNOLOGIES UTILITZADES
IntelliJ
JDK 25

# REQUISITS
JDK 17 o superior

# INSTAL·LACIÓ I EXECUCIÓ
Requisits previs:
Java JDK 17 o superior instal·lat.
IDE com IntelliJ IDEA o bé accés a terminal / consola.

Permisos per executar aplicacions a l’ordinador:
Pas 1: Crear la carpeta del projecte:
Obre l’explorador de fitxers.
Crea una carpeta per al projecte.
Dins aquesta carpeta, crea una subcarpeta src on posarem el codi font.

Pas 2: Afegir els fitxers font:
Copia els fitxers Java (Main.java, NoGenericMethods.java, GenericMethods.java, Person.java) dins la carpeta src.


Pas 3: Compilar el projecte

Si utilitzes terminal:
Obre la terminal i navega a la carpeta del projecte.
Crea una carpeta per al codi compilat.
Compila tots els fitxers Java i guarda’ls a bin.


Pas 4: Executar el projecte:
Executa el projecte indicant la carpeta bin com a classpath.


Pas 5: Opció amb IDE:
Obre IntelliJ IDEA.
Selecciona “Create New Project” o “Import Project”.
Marca la versió de JDK correcte (17+).

Executa Main.java directament des de l’IDE amb el botó de “Run”.

# DESPLEGAMENT
Preparar el projecte:
Compila tots els fitxers .java en fitxers .class o empaqueta en un JAR executable.

Transferir al servidor:
Copia el fitxer .jar al servidor.
Col·loca el JAR en una carpeta del servidor on tinguis permisos per executar-lo.

Executar el projecte en producció:
Accedeix al servidor via terminal (SSH) i navega fins a la carpeta del JAR.

# NIVELL 1 / EXERCICI 1
Crea una jerarquia d’objectes amb tres classes:  Treballador, TreballadorOnline i TreballadorPresencial.
La classe Treballador té els atributs nom, cognom, preu/hora, i el mètode calcularSou() que rep per paràmetre el nombre d'hores treballades i el multiplica pel preu/hora.
Les classes filles l'han de sobreescriure,  emprant @Override. 
Des del main() de la classe Principal, fes les invocacions necessàries per demostrar el funcionament de l’anotació @Override.
En els treballadors presencials, el mètode per calcular el seu sou, rebrà per paràmetre el nombre d’hores treballades al mes. A l’hora de calcular el sou es multiplicarà
el nombre d’hores treballades pel preu/hora, més el valor d'un atribut static anomenat benzina que afegirem en aquesta classe.
En els treballadors online, el mètode per calcular el seu sou rebrà per paràmetre el nombre d'hores treballades al mes. A l'hora de calcular el sou es multiplicarà el nombre
d'hores treballades pel preu/hora i se li sumarà el preu de la tarifa plana d'Internet, que serà una constant de la classe TreballadorOnline.

# NIVELL 1 / EXERCICI 2
Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza l’anotació corresponent. Invoca des d'una classe externa els mètodes obsolets, suprimint
mitjançant l'anotació corresponent els “warnings” per ser obsolets.
