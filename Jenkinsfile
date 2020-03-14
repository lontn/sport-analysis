pipeline {
    agent any
    tools {
        maven 'mvn-3.6.3'
    }

    stages {
        stage('checkout') {
            steps {
                echo 'checkout from gi'
                git url: 'https://github.com/lontn/sport-analysis', branch: 'master'
            }
        }
        stage('Build') {
            steps {
                sh "mvn clean package sport-analysis:repackage"
                sh "printenv" // 將環境變數列印到 console中
            }
        }
        stage('Test') {
            steps {
                echo 'Test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy'
            }
        }
    }
}