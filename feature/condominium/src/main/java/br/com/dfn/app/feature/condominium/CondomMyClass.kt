package br.com.dfn.app.feature.condominium

class CondomMyClass(val name:String, val branch:String) {
    fun setup(): String {
        return "$name $branch"
    }
}