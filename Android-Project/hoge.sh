./gradlew clean
sleep 1

./gradlew apps-common-lib:testDebugUnitTest
./gradlew apps-common-lib:createDebugCoverageReport
sleep 1

./gradlew javaapp:testDebugUnitTest
./gradlew javaapp:createDebugCoverageReport
sleep 1

./gradlew kotlinapp:testDebugUnitTest
./gradlew kotlinapp:createDebugCoverageReport
sleep 1

./gradlew jacocoMergedReport
sleep 1
open apps-common-lib/build/reports/jacoco/jacocoMergedReport/html/index.html
