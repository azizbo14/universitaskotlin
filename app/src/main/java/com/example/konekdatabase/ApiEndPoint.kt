package com.example.konekdatabase

class ApiEndPoint {
    companion object{
        //alamat ip didapatkan melalui cmd dengan mengetik ip config
        private val SERVER ="https://192.168.1.25/universitaskotlin/"
        val CREATE = SERVER+"create_fakultas.php"
        val READ = SERVER+"read_fakultas.php"
        val UPDATE = SERVER+"fakultas_update.php"
        val DELETE = SERVER+"fakultas_delete.php"
    }
}