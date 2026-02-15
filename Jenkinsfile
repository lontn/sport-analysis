pipeline {
    agent any
    tools {
        maven 'mvn-3.6.3' //Jenkins上的maven環境變數
    }

    stages {
        //stage('checkout') {
            //steps {
                //echo 'checkout from gi'
                //git url: 'https://github.com/lontn/sport-analysis', branch: 'master'
            //}
        //}
        stage('Build') {
            steps {
                sh "mvn clean install -DskipTests=true -P local,!gdev,!server"
                sh "mvn -q -DskipTests dependency:tree"
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