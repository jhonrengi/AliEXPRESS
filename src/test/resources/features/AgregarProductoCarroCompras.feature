#language: es
Característica: agregar productos a carro de compras
  Yo como usuario deseo agregar un producto al carro de compras para luego validar su precio
  Escenario: agregar productos al carro de compras exitoso
    Dado que el usuario ingresa a la pagina es.aliexpress.com
    Cuando el usuario busca un producto en la barra de busqueda, lo selecciona y luego se va al carro de compras
    Entonces el usuaio puede validar el precio.