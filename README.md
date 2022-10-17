# Scala 2 vs cats-effect unsafeRunSync()

Reproduction of issue with initialization of objects and cats-effect's
`unsafeRunSync()`.

In Scala 2.13.0, the code hangs on

```
main start
000
```

In Scala 3.2.0, it works as expected.

This issue has been discussed at TypeLevel's #cats-effect channel on Discord:
https://discord.com/channels/632277896739946517/632278585700384799/1031322064583413760
