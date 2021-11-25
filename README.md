# FinTech new aws + scala3 project template

* [shuttle] integration
  * shell scripts linked to sub-projects
  * CJ Fintech AWS accounts
* [aws-cdk] sub-project
  * minimal stack config
  * fully populated package.json with most used aws-cdk dependencies
* [scala 3] sub-project for process
  * [sbt] build tool 
  * [sbt-assembly] plugin for creating uber jars
  * [scala test]
  * optional [ojdbc] integration

## Usage

### Pre-Requirements

* [Giter8] (installed by [Coursier])
```
$ brew install coursier/formulas/coursier
$ cs install giter8
```

### Create a new project from this template

```
$ g8 https://gitlab.cj.dev/empire/scala3.g8
```

* name: project folder and scala sub-project name
* oracle-access-required: true, will add the ojdbc dependency to the scala sub-project





------------
originally forked from [upstream] official scala3 template 


[aws-cdk]: https://docs.aws.amazon.com/cdk/api/latest/
[giter8]: http://www.foundweekends.org/giter8/
[sbt-assembly]: https://github.com/sbt/sbt-assembly
[sbt]: https://www.scala-sbt.org/
[scala 3]: http://dotty.epfl.ch/
[scala check]: https://scalacheck.org/
[scala mock]: https://scalamock.org/
[scala test]: https://www.scalatest.org/
[shuttle]: https://operations.cj.dev/shuttle/docs
[upstream]: https://github.com/scala/scala3.g8
[ojdbc]: https://search.maven.org/search?q=a:ojdbc10
[coursier]: https://get-coursier.io/