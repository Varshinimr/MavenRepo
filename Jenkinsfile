pipeline
{
    agent any
    stages{
        stage("Cleaning Stage"){
            steps{
                bat "mvn clean"
            }
        }
        stage("Testing Stage"){
            steps{
                bat "mvn test"
            }
        }
        stage("Packaging Stage"){
            steps{
                bat "mvn package"
            }
        }
         stage("Consolidate Result"){
            steps{
                input("Do you want to capture Result?")
                junit'**/target/surefire-report/TEST-*.xml'
                archive 'targent/*.jar'
            }

    }
}
