pipeline 
{
    agent any
    environment
    {
        PRODUCT = 'TC35xA'
    }
    stages 
    {
        stage('Stage 1') 
        {
            steps 
            {
                  echo 'Hello world!' 
            }    
        }
        stage('addBadge')
        {
            steps
            {
                 addShortText text: PRODUCT, background:'white', borderColor:'green',color:'green'

            }
        }
    }
    
}
