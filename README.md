# Android Kernel Leak

Simple app to reveal a slab memory leak.

This app contains a modal which is periodically shown or hidden.

Opening and closing modal over time should not increase slab memory but it does on eo-display.

## How to detect a memory leak

Run app with android studio for convenience.

Open a tab to watch slab memory:

```
while true; do adb shell grep SUnreclaim /proc/meminfo; sleep 5; done
```

You should see `SUnreclaim:` increasing over time.
