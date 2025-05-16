# balarila-host

Monorepo containing the backend services of the Balarila website.

Contains the following:

* **Spring Boot Service (Backend API)**
  * Acts as the primary backend interface. It receives requests from the frontend, handles routing and validation, and forwards Filipino sentence data to the Django service, which hosts the Balarila grammar model. After receiving correction results from the Django service, it returns the processed response back to the frontend.
* **Django Service (Balarila Model API)**
  * Hosts the Balarila grammar model. It accepts internal requests from the Spring Boot service, performs grammar correction on Filipino sentences, and returns the results.

## Running locally:

1. `git clone https://github.com/su0h/balarila-host.git` to preferred directory
2. Open terminal and `cd` to directory of cloned balarila-host repository
3. `cd` to backend folder and run `mvn clean install`
4. `cd` back to root directory of balarila-host and run the following:
   * `docker-compose build --no-cache`
   * `docker-compose up`
5. Done! Both services are now running via separate Docker containers.
6. If there are code changes to the Spring Boot service, the Spring Boot project has to be repackaged and the Docker containers have to be rebuilt to include the new changes from the project. If this is the case, do the following:
   * `cd` to backend folder
   * run `mvn clean install`
   * `cd` back to root folder
   * run `docker-compose down --volumes --remove-orphans`
   * run `docker-compose build --no-cache` again
   * run `docker-compose up`
   * Done!

## TODOs:

* [ ] Add linting to both services (e.g. SonarQube)
* [ ] Add commitlint
* [ ] Rename services (if needed)
* [ ] Implement model inference to Django service.
  * [ ] Find a way to add model file to project. One possible option is to download the model file in Docker container (Dockerfile)
* [ ] Refactor methods as necessary - check for vulnerabilities and required logic changes.
