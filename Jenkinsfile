pipeline {
    agent any
    stages {
        stage('the cleaning stage') {
            steps {
                bat 'dir'
                bat 'gradle.bat clean'
            }
        }
        stage('the building stage') {
            steps {
                bat 'gradle.bat build'
            }
        }
        stage('the testing stage, 30 tests') {
            steps {
                bat 'gradle.bat test'
            }
        }
    }
    post {
        always {
            junit 'build/test-results/test/*.xml'
        }
    }
}