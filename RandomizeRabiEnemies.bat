cmd /c "original_to_editable.bat"
cmd /c "java -jar .\RandomizeRabiEnemies.jar s2_editable_maps/area*.json"
cmd /c "editable_to_final.bat"