Description des configurations de DevOps

Les outils 
1. git 
2. github
3. Jenkins
4. Docker

1.Installation de git sur linux 
	sudo apt-get update
	sudo apt-get install git 
	sudo git -version //voir la version installée
	

2.Configuation de github
	Créer d'abord un compte github
        Creér son repository

Git-Github
Une fois 1) et 2) effectués suivez les instructions suivantes pour envoyer votre projet sur github
Aller sur sa machine 
Aller en ligne de commande dans le repertoire contenant le projet  que vous voulez suivre avec git et tapez les commande suivantes.
	-git init 
	-git add . // pour suivre tous les elements du dossier courant
	-git commit -m "version du projet"

	-git remote add origin https://github.com/Nom_utilisateur/Nom_repository.git
	-git push -u origin master // cette dernière commande va vous demender votre nom d'utilisateur et votre votre mot de passe 

3.Installation et configuration de jenkins 
		Step 1 – Add Jenkins PPA
	wget -q -O - https://pkg.jenkins.io/debian/jenkins.io.key | sudo apt-key add -
	sudo sh -c 'echo deb http://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list'
		 Step 2 – Install Jenkins on Ubuntu
	sudo apt-get update
	sudo apt-get install jenkins


3.Installation de docker
