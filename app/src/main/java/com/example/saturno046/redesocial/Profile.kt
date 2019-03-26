package com.example.saturno046.redesocial


data class Profile (var name: String = "", var email: String = "", var address: String = ""){

    override fun equals(other: Any?): Boolean {
        // guard let
        if (!(other is Profile)) return false
        // se a comparacao deu veradedeiro fica verde por nao necessitar mais de validacao
        return this.email == other.email
    }
}
