pipeline {
    agent any {
        stages {
            stage('build'){
                steps {
                    echo "build stage is in progress for the app"
                }
            }

            stage('test'){
                steps{
                    echo "testing the application code";

                    echo "application testing completed successfully";
                }
            }
            stage('deploy'){
                steps{
                    echo "deployment in progress";
                }
            }
        }
    }
}