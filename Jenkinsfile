pipeline {
    agent any
    triggers{
       scm('H/1 * * * *')
    }
    stages {
        stage('Git Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/aadityapatill/Rest-Assured.git'
            }
        }
        stage('Compile') {
            steps {
                bat 'mvn clean'
            }
        }
        stage('Test') {
             steps {
                 bat 'mvn clean test'
             }
        }
    }
}
