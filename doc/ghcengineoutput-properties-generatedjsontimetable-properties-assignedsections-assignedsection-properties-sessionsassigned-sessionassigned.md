# SessionAssigned Schema

```txt
undefined#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items
```

Class unit or on call hour assigned in the timetable.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                       |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghcEngineOutput.schema.json\*](../../../out/ghcEngineOutput.schema.json "open original schema") |

## items Type

`object` ([SessionAssigned](ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned.md))

# items Properties

| Property                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                    |
| :------------------------------ | :-------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refSesion](#refsesion)         | `integer` | Required | cannot be null | [EngineOutputGHCSchema](ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refsesion.md "undefined#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items/properties/refSesion")         |
| [refClassRomms](#refclassromms) | `array`   | Optional | cannot be null | [EngineOutputGHCSchema](ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refclassromms.md "undefined#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items/properties/refClassRomms") |
| [refTeachers](#refteachers)     | `array`   | Optional | cannot be null | [EngineOutputGHCSchema](ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refteachers.md "undefined#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items/properties/refTeachers")     |

## refSesion

Identifier of the session in the input file.

`refSesion`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineOutputGHCSchema](ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refsesion.md "undefined#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items/properties/refSesion")

### refSesion Type

`integer`

## refClassRomms

List of classrooms assigned to teach the class unit.

`refClassRomms`

*   is optional

*   Type: `string[]` ([RefclassRomm](ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refclassromms-refclassromm.md))

*   cannot be null

*   defined in: [EngineOutputGHCSchema](ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refclassromms.md "undefined#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items/properties/refClassRomms")

### refClassRomms Type

`string[]` ([RefclassRomm](ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refclassromms-refclassromm.md))

## refTeachers

List of teachers assigned to the class unit.

`refTeachers`

*   is optional

*   Type: `string[]` ([RefTeacher](ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refteachers-refteacher.md))

*   cannot be null

*   defined in: [EngineOutputGHCSchema](ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refteachers.md "undefined#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned/items/properties/refTeachers")

### refTeachers Type

`string[]` ([RefTeacher](ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned-properties-refteachers-refteacher.md))
