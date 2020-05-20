##### **_This should give detailed explanation on how to clone and run the Yizsell Facebook Bot._**

**`Yizsell Inventory/Point of Sale System's Facebook bot.`**

The application which is developed using spring boot, a java framework, has its dependencies managed by maven.
* _To run the application, please ensure that `java(min version 1.8)`, and `maven` are properly installed to on your machine_
> * verify this with the command `java -version`, `javac -version`, and `mvn --version` on your terminal.

* _Clone the `dev` branch, if in master, checkout to `remote/origin/dev`_
* ##### _Create a `.env` file in the applications `src/main/resources` folder, and specify the following:_
> 1. `DATABASE_USERNAME`
> 2. `DATABASE_PASSWORD`
> 3. `DATABASE_PORT`
> 4. `DATABASE_NAME`
> 5. `SERVER_PORT` 
> 6. `LOCAL_HOST_URL`
> 7. `TIME_ZONE`

> * NB: Do not use an empty string as password, ensure you provide the correct username and password to your DB server. If any of the values is not specified correctly, the app wont start.
* `Examlple: DATABASE_PORT=3306`
> * NB: The last three variables may not be specified as they have have default values, ensure however that port `8071` is open and free in your machine. The default values are:
> 5. `SERVER_PORT=8071` 
> 6. `LOCAL_HOST_URL=localhost`
> 7. `TIME_ZONE=useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC`
* ##### _Lunch the application with the command `mvn spring-boot:run`_
> * NB: If app doesn't start, then load the `.env` file with the command: `source ./src/main/resources/.env`, this command should be run from the project root directory. After this re-run the app again.