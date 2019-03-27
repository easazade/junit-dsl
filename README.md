# junit-dsl
![screenshot 1](junit-dsl-logo-small.png?raw=true "screenshot")


kotlin dsl extension plus useful helper functions for java junit testing library
<br>
<br>

<table>
<tr>
<td>Gradle</td>
<td>
<pre>
//add this maven repo to your root project 
repositories {
	maven {
		url  "https://easazadeco.bintray.com/maven"
	}
}
</pre>
<pre>
//add this to your module dependencies
testImplementation 'ir.alireza.easazade:junit-dsl:0.1.1'
</pre>
</td>
</tr>
</table>

# Examples

### objects

````kotlin
val flag = true
flag shouldEqualTo true //assertion passes

val name = "alireza"
name shouldEqualTo "alireza" //assertion passess
````

### collections

````kotlin
val list = listOf("item1", "item2", "car", "dog")

list shouldContainAtLeasOneItemMatching { it.contains("item") } //assertion passess

list shouldNotContainAnyItemMatching { it.contains("shapoor") } //assertion passess

val listOfBooks = listOf<Book>()
listOfBooks shouldBe EMPTY //assertion passess

````