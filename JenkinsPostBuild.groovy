public class JenkinsPostBuild {

	def manager

	public JenkinsPostBuild(Object manager){
		this.manager = manager
	}
	public def run()
	{

	def prod = manager.build.buildVariables.get('PRODUCT')
	if(prod=='TC38xA') {
		manager.addShortText(prod,"black", "lightgreen", "1px", "black")
	}	
	else if(prod=='TC39xA') {
		manager.addShortText(prod,"black", "lightgrey", "1px", "black")
	}
	else if(prod=='TC39xB') {
		manager.addShortText(prod,"black", "yellow", "1px", "black")
	}
	else if(prod=='TC35xA') {
		manager.addShortText(prod,"black", "lightblue", "1px", "black")
	}
	else if(prod=='TC37xA') {
		manager.addShortText(prod,"black", "pink", "1px", "black")
	}
	else if(prod=='TC36xA') {
		manager.addShortText(prod,"black", "violet", "1px", "black")
	}
	else if(prod=='TC37xAED') {
		manager.addShortText(prod,"black", "orange", "1px", "black")
	}
	else if(prod=='TC33xA') {
		manager.addShortText(prod,"white", "indigo", "1px", "black")
	}
	else if(prod=='TC33xAED') {
		manager.addShortText(prod,"white", "blue", "1px", "black")
	}
	else if(prod=='TC3Ex') {
		manager.addShortText(prod,"blue", "white", "1px", "blue")
	}
	else if(prod=='TC3Ax') {
		manager.addShortText(prod,"white", "brown", "1px", "black")
	}
	else {
		manager.addShortText(prod,"black", "red", "1px", "black")
	}
}
}