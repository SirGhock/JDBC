*----------------Realizado por---------------------*
|						   |
|	Sidnei Aparecido Lechado Junior 1598597    |
|	Jo�o Fernando Garcia de Souza 1892886      |
|  Alunos do 5� per�odo de Engenharia de Software  |
|     Universidade Tecnol�gica Federal do Paran�   |
|						   |
*--------------------------------------------------*

-Banco de dados utilizado mysql Workbench;
-Sql code anexado na pasta em: "sql_code.txt";
-As configura��es da conex�o com o banco, est�o no pacote "connection" e dentro da classe "ConnectionFactory.java";
-Somente alterar as configura��es abaixo:

    private static final String DRIVER = "com.mysql.jdbc.Driver";	      //driver do banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/projeto";  //url de conex�o com o banco
    private static final String USER = "root";                                //nome de usu�rio do banco 
    private static final String PASS = "";				      //password do banco de dados

-O drive do banco pode ser encontrado no site do banco de dados. Na IDE Netbeans, dependendo do processo de instala��o
escolhido, vem incluso o drive de alguns bancos mais conhecidos, sendo necess�rio apenas importar para a pasta do projeto
-Link para download do driver caso n�o possuir: "https://dev.mysql.com/downloads/connector/j/8.0.html"
 



			