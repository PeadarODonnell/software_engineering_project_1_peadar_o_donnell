pipeline {
    agent any
    stages {
        stage('the cleaning stage') {
            steps {
                sh './gradlew clean'
            }
        }
        stage('the building stage') {
            steps {
                sh './gradlew build'
            }
        }
        stage('the testing stage, 30 tests') {
            steps {
                sh './gradlew test'
            }
        }
    }
    post {
        always {
            junit 'build/test-results/test/*.xml'
        }
    }
}