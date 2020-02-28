package kz.uib.uiconstraintlayout


import java.util.*
import java.util.Collections.max
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.math.max


fun main() {

    val s = "assd"
    val t = "dsas"
    println(isValid("()))"))

}

fun isValid(s: String): Boolean {
    var braSimple = HashMap<Char, Char>()
    braSimple.put('(', ')')
    braSimple.put('{', '}')
    braSimple.put('[',']')

    val stack = ArrayList<Char>()


    if(s.length%2!=0)
        return false


    for (i in s){
        if(braSimple.contains(i)){
            stack.add(i)
        }
        else if (stack.size==0 || braSimple[stack.removeAt(stack.count()-1)]!=i)
            return false
    }
    return stack.size==0
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {

    var output: List<List<String>>

    var group = HashMap<String, ArrayList<String>>()

    for (str in strs){
        val key = str.toCharArray().sortedArray().joinToString("")
        println(key)
        if (group.containsKey(key)){
            group[key]?.add(str)
        }
        else
            group[key] = arrayListOf(str)
    }

    output = group.map { it.value.toList() }


    return output

    //[,["nam"],["qua"],["pup","pup"],["rod"],["oho"],["ram"],["jed"],["bum"],["gap"],["hos"],["boo","bob"],["max"],["iva"],["dis"],["mir"],["brr"],["sol"],["gym"],["yea"],["bye"],["deb","deb"],["nap"],["pen"],["job"],["aha"],["eel"],["wow"],["jab"],["elf"],["yap"],["hem"],["lyx"],["let"],["lon"],["nay"],["rye"],["aft"],["doc"],["hog"],["eve"],["lye"],["ugh","ugh"],["hey"]]
    //[["sol"],["wow"],["gap"],["hem"],["yap"],["bum"],["ugh","ugh"],["aha"],["jab"],["eve"],["lyx"],["jed"],["iva"],["rod"],["boo"],["brr"],["hog"],["nay"],["mir"],["deb","deb"],["aft"],["dis"],["yea"],["hos"],["rye"],["hey"],["doc"],["bob"],["eel"],["pen"],["job"],["max"],["oho"],["lye"],["ram"],["nap"],["elf"],["qua"],["pup","pup"],["let"],["gym"],["nam"],["bye"],["lon"]]
}

fun isAnagram(s:String, t:String):Boolean{
    if (s.length!=t.length)
        return false

    var chars =  HashMap<Char, Int?>()

    for (key in s){
        if (!chars.containsKey(key))
            chars[key] = 1
        else chars[key] = chars[key]?.plus(1)
    }

    for (key in t){
        if (!chars.containsKey(key) ||chars[key]==0)
            return false
        else {
            chars[key] = chars[key]?.minus(1)
        }
    }

    for (i in chars.keys){
        println("$i  = ${chars[i]}")
    }


    return true
}
