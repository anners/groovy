//beer.groovy
println "Welcome to Anners Brew"
println "On tap we have:"

//list of beers
def taplist = ["ipa", "lager", "esb", "dunkel", "stout"]
for (i in taplist) { println i }

def beer = System.console().readLine("What would you like to drink? ")

println "Here is your $beer"

/*
this.args.each {
	arg -> println "hi, ${arg}!" 
}
*/

