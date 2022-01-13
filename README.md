# action_test

## 목표
github action을 이용해 다음의 과정을 수행한다.

1. 프로젝트를 clone한다.
2. build 한다. (test 당연히 포함)
3. 빌드된 jar파일을 docker image로 만든다.
4. docker hub에 업로드한다.

<br>
<br> 
## Reference
dockfile 생성 : https://docs.docker.com/develop/develop-images/dockerfile_best-practices/

git action secrets 설정 : https://docs.github.com/en/actions/security-guides/encrypted-secrets

docker push git action : https://docs.docker.com/ci-cd/github-actions/
