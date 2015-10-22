
clean

mvn clean


for DEV

mvn -DskipTests -PDEV package


for PROD

mvn -DskipTests -PPROD package