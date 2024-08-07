Feature: Aperturar Cuentas Magneto y Compra de producto
  Yo Como usuario nuevo en Magneto
  Quiero aperturar una cuenta de ahorros
  Para hacer la compra de un producto


  Scenario Outline: Creacion de un usuario para realizar compra de articulos
    Given que Daniel esta en la pagina de magneto
    And se registra en la tienda virtual
    And selecciona el producto y los detalles del producto
    And el usuario valida su compra y agrega los detalles de pago
    Then el deberia de ver que su compra fue realizada de manera exitosa
    Examples:
      | tipoCuenta |
      #| CHECKING   |
      | SAVINGS    |
