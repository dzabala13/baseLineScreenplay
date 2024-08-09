Feature: Aperturar Cuentas Magneto y Compra de producto
  Yo Como usuario nuevo en Magneto
  Quiero aperturar una cuenta de ahorros
  Para hacer la compra de un producto


  Scenario: Creacion de un usuario para realizar compra de articulos
    Given que Daniel esta en la pagina de magneto
    And se registra en la tienda virtual
      | nombre | apellido  | email                  | password    |
      | Juan   | Fernandez | danielfalso7@gmail.com | Password123 |
    And selecciona el producto y los detalles del producto
      | item                | talla | color | cantidad |
      | Fiona Fitness Short | 28    | Black | 1        |
    And el usuario valida su compra y agrega los detalles de pago
      | company | address           | city   | province | postal_code | country     | phone      |
      | globant | carrera falsa 123 | bogota | Arizona  | 10021       | Afghanistan | 3133201122 |
    Then el deberia de ver que su compra fue realizada de manera exitosa

