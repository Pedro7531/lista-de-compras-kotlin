var lista: MutableList<String> = mutableListOf()

fun adicionarItem(){
    print("Digite o item que deseja adicionar: ")
    val item = readln()

    if (item.isBlank()) {
        println("Erro: O item não pode estar vazio!")
    } else {
        lista.add(item)
        println("Item '$item' adicionado com sucesso!")
    }
}

fun listaItens(){
    if (lista.isEmpty()) {
        println("A lista está vazia.")
    } else {
        println("Itens na lista:")
        lista.forEachIndexed { 
            index, item -> println("${index + 1}. $item") 
        }
    }
}

fun removerItem(){
    listaItens() 
    if (lista.isNotEmpty()) {
        print("Digite o número do item que deseja remover: ")
        val indice = readln().toIntOrNull()
        
        if (indice != null && indice in 1..lista.size) {
            val itemRemovido = lista.removeAt(indice - 1)
            println("Item '$itemRemovido' removido com sucesso!")
        } else {
            println("Número inválido!")
        }
    }
}

fun showMenu(){
    while (true){
        println("Menu:")
        println("1. Adcionar item")
        println("2. Lista item")
        println("3.Excluir item")
        println("4. Sair")
        print("Opção:")
        var opcao = readln()
        when(opcao){
            "1" -> adicionarItem()
            "2" -> listaItens()
            "3" -> removerItem()
            "0" -> break
            else -> println("Opção invalida!")   
        }
    }
}

fun main(){
    showMenu()
}