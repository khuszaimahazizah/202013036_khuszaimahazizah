// @dart=2.12
// Flutter web bootstrap script for package:flutter_application_1/main.dart.

import 'dart:ui' as ui;
import 'dart:async';

import 'package:flutter_application_1/main.dart' as entrypoint;

typedef _UnaryFunction = dynamic Function(List<String> args);
typedef _NullaryFunction = dynamic Function();
Future<void> main() async {
  await ui.webOnlyInitializePlatform();
  if (entrypoint.main is _UnaryFunction) {
    return (entrypoint.main as _UnaryFunction)(<String>[]);
  }
  return (entrypoint.main as _NullaryFunction)();
}
