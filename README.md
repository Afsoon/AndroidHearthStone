# AndroidHearthStone
Proyecto para poner en práctica diferentes librerías, patrones y arquitecturas. Las librerías
que se han puesto en prueba ha sido:

  - <b> Retrofit + OKHttp + Jakcson </b>: Para las conexiones con la API y Jackson para la deserialización 
  de los JSON de respuesta.
  
  - <b>Picasso</b>: Para la descarga y tener en cache las imágenes.
  
  - <b>**[Android Easy Cache](https://github.com/vincentbrison/android-easy-cache)**</b>: Nos hace mas sencilla el manejo de la cache, ya que ella
  aloja, desaloja los objetos por nosotros y se apoya en la LRUCache y DiskLRUCache.
  
  - <b>RxJava + RxAndroid</b>: Realizar operaciones costosas, como de peticiones a la red, en segundo
  plano. Sus posibilidades son mayores pero se ha utilizado mayormente para esto y que Retrofit
  es compatible con estos. 
  
  - <b>Parceler</b>: Nos facilita la serialización de objetos propios y no te que crear sus métodos 
  correspondientes.
  
  - <b>Butterknife </b>: Nos permite usar anotaciones para inicializar nuestras views y no tener que
  escribir boilerplate.
  
  - <b>**[AndroidViewModel](https://github.com/inloop/AndroidViewModel)**</b>: Nos facilita el desarrollo de Fragments y Activity aplicando el patrón MVVM
  y nos garantiza que las operaciones en segundo plano se mantiene tras rotar el móvil, tablet.
  
Los patrones utilizados son:

  - <b>MVVM</b>: Para mantener una indenpendecia entre la lógica de la interfaz y la lógica de negocio
  asociada a esa interfaz y facilitar su testeo y reusabilidad en otros proyectos.
  
  - <b>DAO</b>: Tenemos una interfaz que hace de intermediario entre la interfaz de usuario y 
  los datos de la aplicación. La aplicación pide los datos que necesita y esta no se preocupa
  de donde se obtiene, está recibirá los datos. En este caso, cuando el usuario pide unos datos
  estos puede proceder de una petición a la API, que después será almacenada en la cache, o de
  la propia cache del programa.
  
  - <b> Factory </b>: Usando en el patron DAO para que nos devuelva la instancia necesaria para
  obtener los datos que ha pedido el usuario. 
  
La arquitectura ha sido:

  - La arquitectura explicada por **[Fernando Cejas (Clean arquitectura)](http://fernandocejas.com/2015/07/18/architecting-android-the-evolution/)**, aunque en este caso no 
  se ha utilizado el módulo, aunque se encuentre presente, <b>"model"</b>. Esto es debido a que el
  patrón MVVM ya me proporcionaba, en este caso concreto, suficiente independicia para el 
  modelo de datos de la interfaz de usuario y de sus acciones.
  
Pendiente por hacer:
  
  - Mejorar la interfaz: Tanto diseño como posibles fallos que puedan haber en otras resoluciones no probadas.
  - Cambiar a referencias la cache en RAM.
  - Integrar las acciones restantes.
  - Añadir los test correspondientes.
