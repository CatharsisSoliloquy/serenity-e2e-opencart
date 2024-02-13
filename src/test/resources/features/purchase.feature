
@PurchaseFlow @GeneralScenario
Feature: Compra de productos en OpenCart
  Como un usuario de la tienda OpenCart
  Quiero agregar productos a mi carrito llenar el checkout
  y finalizar el pedido

@ScenarioGlobal
Scenario: Flujo del proceso de compra
  Given que el usuario está en la página de inicio de OpenCart
  When el usuario agrega dos productos al carrito
  Then puede verificar los productos en el carrito e ir al checkout
  When completa el checkout con todos los pasos y datos necesarios
  Then puede ver el mensaje ¡Tu pedido ha sido realizado!




