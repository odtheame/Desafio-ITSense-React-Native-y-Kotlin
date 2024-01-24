import React, { useEffect } from 'react';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, NativeModules } from 'react-native';

export default function App() {
  useEffect(() => {

  NativeModules.SumaNumeros.sumarPares([1, 2, 3, 4, 5, 6])
    .then(resultadoSuma => {
      console.log('La suma de los pares es:', resultadoSuma);
    })
    .catch(error => {
      console.error('Error al sumar pares:', error);
    });
  }, []);
  return (
    <View style={styles.container}>
      <Text>ME DUELEN LAS TETORRAS!</Text>
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
