# Scala 2 vs cats-effect unsafeRunSync()

Reproduction of issue with initialization of objects and cats-effect's
`unsafeRunSync()`.

In Scala 2.13.0, the code hangs on

```
main start
000
```

In Scala 3.2.0, it works as expected.
