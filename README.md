# issue49121

### Steps to reproduce
1. Open app
2. Run `./gradlew assembleRelease` in terminal
3. Error displayed:
```
FAILURE: Build failed with an exception.

* What went wrong:
Could not determine the dependencies of task ':app:lintVitalReportRelease'.
> Could not create task ':app:injectCrashlyticsBuildIdsRelease'.
   > Cannot invoke method map() on null object

```
