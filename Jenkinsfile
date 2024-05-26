pipeline {
    agent any

    stages {
       
        stage('Build') {
            steps {
                echo 'Hello World'
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
    post
    {
        always
        {
            emailext body: 'pipeline status fail', subject: 'pipeline status', to: 'payal0782@gmail.com'
        }
    }
}
