//beer.groovy
println "Welcome to Anners Brew"
println "On tap we have:"

//list of beers
def taplist = ["ipa", "lager", "esb", "dunkel", "stout"]
for (i in taplist) { println i }

def beer = System.console().readLine("What would you like to drink? ")

if ( taplist.contains(beer) ) {
//print price
	println "Here is your $beer"
} else {
//make taplist print a method
	println "Sorry we only don't have your beer"
} 


