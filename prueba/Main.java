//escribir en archivo

Scanner sc = new Scanner();

File file = new File(usuarioTeclado + ".txt");
BufferedWriter bf = new BufferedWriter( new FileWriter(file));

String clasveSupersecreta ) sc.nextLine();

bf.write(claveSupersecreta);

//para que guarde la contraseña
bf.flush();

//leer archivo
File file = new File(usuarioTeclado + ".txt");
if (!file.exists()){
  throw FileNotFoundException()
}

BufferedWriter bf = new BufferedWriter( new FileReader(file));
String contenido = br.readLine();
