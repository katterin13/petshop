# Create SSH - Key

```
cd .ssh
ssh-keygen -t ed25519 -C "test@gmail.com"
```
then enter the file name

# PetShop

- H2 ui: http://localhost:8080/h2-console/login.do

- Swagger ui: http://localhost:8080/swagger-ui/index.html


### Run proyect

Libraries
- JUnit 5
- Spring Boot
- Maven
- DB H2
- Java version 11
- Sawgger


Run Project

```
mvn spring-boot:run
```

## Unit Test
Example Unit test

```
@Test
void should_ReturnTrue_When_equalsLenght() {
// given
String textA = "library";
String textB = "numeric";
// when
boolean result =
validateService.equalsLenght(textA, textB);
// then
assertTrue(result);
}
```

## Test-lifecycle

![test-lifecycle](/src/main/resources/img/test-lifecycle.drawio.png)


## Assertion types

 - check if x is true/false
```
assertTrue(x);
assertFalse(x);
```
- check if object is null
```
assertNull(object);
```
- check if expected equals actual (primitive types only)
```
assertEquals(expected, actual);
```
- check if array1 and array2  and contain the same elements
```
assertArrayEquals(array1, array2);
```
- check if dotry() throws
```
Executable executable = () -> doSth();
assertThrows(
SampleException.class,
executable
);
```
-  check multiple assertions
```
assertAll(
() → assertEquals(expected1, actual1),
() → assertEquals(expected2, actual2)
);
```


## GIT 
```

COMANDOS DE CONFIGURACIÓN
============================================
git config --global user.name 'nombre'
git config --global user.email 'asd@asd.com'
git config --global color.ui true

TRABAJAR CON GIT
============================================
git init //iniciar git
git status // estado 

HACER UN COMMIT
============================================
git fetch origin <nombre rama>	//bajar los cambios del repo remoto al repo local
git merge origin/master 		//subir los cambios al repo local es como el  <hg update>
git add -A 			//agregar todo
git commit -m 'Primer commit'
git push origin master		//pasa cambios del repo local al repo remoto en la rama principal
git push origin <nombre rama>	//pasa cambios del repo local al repo remoto

Nota:
git pull 				//es la union de git fetch + git merge origin/master 	

SOLUCIONAR UN COMMIT CON CONFICTO
============================================
 git stash save			//guardar las cambios locales
  git merge origin/master 		//2.subir los cambios al repo local es como el  <hg update>
  git stash pop

SOLUCIONAR UN COMMIT CON CONFICTO
============================================
git fetch origin 			//1.bajar los cambios del repo remoto al repo local
git merge origin/master 		//2.subir los cambios al repo local es como el  <hg update>
//3.sale el error -- luego ajustar el archivo manualmente
git status			//3 mirar el estado
git commit -m “mensaje”	//hacer el commit de los archivos arreglados
git push origin master		//pasa cambios del repo local al repo remoto en la rama principal


MOVERSE DENTRO DE LOS COMMIT
============================================
git checkout <num chart de commit> 		// nos movemos al commit que le indiquemos
git checkout master 				//moverse al ultimo commit
git reset --soft <num chart de commit>		//Elimina el commit pero no se pierde el código del work area
git reset --hard <num chart de commit>		//Elimina el commit y se pierde el codigo lo deja como estaba en estado del commit indicado



VER LOS COMMIT 
============================================
git log -2				//ver el log de los últimos commits
git log > commits.txt			//enviar el historial del commit a un archivo .txt
git log --graph --oneline --decorate	//ver gráficamente la línea de commit

BRANCH
============================================
git branch				//lista todas las remas 
git branch -a				//Mostrar las ramas ocultas
git branch <nombre rama>		//crea una rama
git checkout <nombre rama>		//nos movemos a la rama seleccionada
git branch -D <nombre rama>		//Eliminar una rama
git checkout -b <nombre rama>		//crear y moverse a la nueva rama


UNIR BRANCH
============================================
Pararse en la rama a la que se quiere pasar los cambios. master es la rama principal
git checkout master			//nos movemos a la rama seleccionada
Verificar que estamos en master
git branch				//la que aparece en * es donde esta
Hacer merge con la otra rama
git merge <nombre otra rama>		//hace merge entre las remas
Opcionar es eliminar la otra rama
git branch -D <nombre rama>

DELETE REMOTE_ BRANCH
============================================

git checkout master		//nos movemos a la rama master
git push origin --delete <branch>  // eliminar la rama remota y local

UNIR GIT LOCAL CON EL GIT REMOTO
============================================

git remote add origin https://direcciondelrepo 	//tenemos un proyecto creado y luego creamos el repo remoto, entonces este comando adiciona el proyecto al repo remoto
git remote remove origin 				//eliminamos el proyecto del repo remoto
git remote -v					//visualiza a cual repo remoto estamos conectados

CAMBIAR MENSAJE DE UN COMMIT
============================================
Para cambiar el mensaje de un commit hay que hacer dos pasos:
git commit --amend -m “mensaje ”	//Cambiar el mensaje del último commit
git push origin master -f			//forzar para subir el cambio al repo remoto


TAG - anotaciones sobre los commit
============================================
Se escribe la versión sobre la cual se quiere realizar el tag Ejm: v1.0, v1.2...
git tag v1.0				//hacer un tag al último commit ligero
git tag -a v1.0 -m “mensaje”		//hacer un tag al último commit con detalle
git tag -a v1.0 -m “mensaje” <num sha> 	//Especificar sobre que commit
git push origin v1.0 			//Subir un tag específico al repo remoto
git push origin --tags			//Subir todos los tags al repo remoto

```

## Practice Exercise

create a service that allows you to update the amount of a product in inventory if it is available
