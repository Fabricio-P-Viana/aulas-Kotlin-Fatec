package com.example.sqllitepessoa
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var databaseHelper: DatabaseHelper
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        databaseHelper = DatabaseHelper(this)
        try {
            databaseHelper.insertPessoa("Marcos", 18, 1.75, 65.0)
            databaseHelper.insertPessoa("Paulo", 3, 1.10, 15.0)
            databaseHelper.insertPessoa("Marcia", 28, 1.60, 55.0)
            /* Recuperação e exibição de dados das pessoas através da chamada do método getAllPessoas que foi codificado na classe databaseHelper. O resultado é exibido usado-se o Log.i. O cursor é movido para o primeiro registro e, em seguida, ocorre o looping para acessar is registros restantes, exibindo o nome e a idade de cada pessoa cadastrada no banco de dados app.db*/
            val pessoasList = databaseHelper.getAllPessoas()
            for (pessoa in pessoasList) {
                Log.i("RESULTADO = NOME: ", pessoa.nome)
                Log.i("RESULTADO = IDADE: ", pessoa.idade.toString())
                Log.i("RESULTADO = ALTURA: ", pessoa.altura.toString())
                Log.i("RESULTADO = PESO: ", pessoa.peso.toString())
            }
        } catch (e: Exception) {
            e.printStackTrace()
            Toast.makeText(this, "Ocorreu um erro ao executar o aplicativo", Toast.LENGTH_SHORT).show()
        }
    }
}