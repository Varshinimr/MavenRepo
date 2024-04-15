pipeline
{
    agent any
    stages{
        stage("Parallel Execution"){
        steps{
    parallel{
        a:{
            bat "mvn clean"
        }
          b:{
            bat "mvn test"
        }
          c:{
            bat "mvn package"
        }
    }
        }
        }
            
         stage("Consolidate Result"){
            steps{
                input("Do you want to capture Result?")
                junit '**/target/surefire-reports/TEST-*.xml'
                archive 'targent/*.jar'
            }
         }
            stage("Email build"){
steps{
    mail body: "${env_JOB_NAME} - Build ${env.BUILD_NUMBER}"

    }
}
    }
}
