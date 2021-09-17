import 'package:flutter/material.dart';

class Tampilan extends StatelessWidget {
  Widget build(BuildContext context) {
    return MaterialApp(
        home: Scaffold(
      appBar: AppBar(
        leading: const IconButton(
          icon: Icon(Icons.menu),
          tooltip: 'Navigation menu',
          onPressed: null,
        ),
        title: Text('khuszaimah azizah'),
      ),
      body: Center(child: Text('hallo')),
      backgroundColor: Colors.blueGrey.shade200,
    ));
  }
}

void main() {
  runApp(Tampilan());
}
